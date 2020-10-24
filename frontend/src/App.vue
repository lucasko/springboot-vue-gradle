<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App"/>

  <div id="event-with-method">
    <!-- `greet` is the name of a method defined below -->
    <button @click="greet">Greet</button>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  },
    methods: {
		async greet(){
			alert('Hello !')
			const res = await fetch("http://localhost:8080/api/product");
			const data = await res.json();
			this.data = data;
			alert(data.name )
		}
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
