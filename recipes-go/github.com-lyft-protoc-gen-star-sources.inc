SRC_URI_append = " https://proxy.golang.org/github.com/lyft/protoc-gen-star/@v/v0.5.2.zip;srcoutput=github.com/lyft/protoc-gen-star;srcinput=github.com/lyft/protoc-gen-star@v0.5.2;downloadfilename=github-com-lyft-protoc-gen-star-0.5.2.zip;name=github-com-lyft-protoc-gen-star"
SRC_URI[github-com-lyft-protoc-gen-star.sha256sum] = "ae6299b31156146fa0cbb0509b7cf821db252c60b8fb03a90435feee1de84777"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/lyft/protoc-gen-star/LICENSE;md5=175792518e4ac015ab6696d16c4f607e \
"
