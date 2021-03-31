SRC_URI_append = " https://proxy.golang.org/github.com/rs/cors/@v/v1.7.0.zip;srcoutput=github.com/rs/cors;srcinput=github.com/rs/cors@v1.7.0;downloadfilename=github-com-rs-cors-1.7.0.zip;name=github-com-rs-cors"
SRC_URI[github-com-rs-cors.sha256sum] = "67815316761fddc4acfaad852965cf04ec88674abe3a05c6c332519556c55855"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/rs/cors/LICENSE;md5=04924a837bc661a5d288479a17393ff2 \
"
