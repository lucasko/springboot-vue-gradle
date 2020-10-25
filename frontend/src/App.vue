<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App"/>

  <div id="event-with-method">
    <!-- `greet` is the name of a method defined below -->
    <button @click="greet">Greet</button>
  </div>


  {{	user.username	}} =
  {{	fullName	}}
  <p> follower: {{ followers }}</p>

   <button @click="addFollower">addFollower</button>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
	name: 'App',
	components: {
	HelloWorld
	},
	data(){
	return {
		followers: 100,
		user: {
			username: "ru ko",
			fname : "lucas",
			lname : "ko",
			address:  "AB1 CD2"
		}
	}
	},
	watch: {
		followers(newCount,oldCount)
		{
			if(newCount % 2 == 0)
			{
				console.log('newCount is ' + newCount	)
				console.log('oldCount is ' + oldCount	)
			}
		}
	},
	computed: {
		fullName(){
			return `${ this.user.fname}, ${this.user.lname}` ;
		}
	},
	methods: {
		async greet(){
			alert('Hello !')
			const res = await fetch("http://localhost:8080/api/product");
			const data = await res.json();
			this.data = data;
			alert(data.name )
		},
		addFollower(){
			this.followers ++
		}
	},
	mounted() {
		this.addFollower()
	}
}



</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
