export class Product {
    constructor(
        public id:number,
        public nombrep:string,
        public codigo:string,
        public descripcion:string,
        public precio:number,
        public urlImagen:string,
        public image:File,
        public userId:string,
        public categoriaId:string,
        
    ){}
}
