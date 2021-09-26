SRC_URI += "https://proxy.golang.org/github.com/joho/godotenv/@v/v1.4.0.zip;srcoutput=github.com/joho/godotenv;srcinput=github.com/joho/godotenv@v1.4.0;downloadfilename=github-com-joho-godotenv-1.4.0.zip;name=github-com-joho-godotenv"
SRC_URI[github-com-joho-godotenv.sha256sum] = "6c6d2f6c2a9d2ee8608e4acd7ba7035d31b1f0da3c7d9537a32928b8eed4e3cd"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/joho/godotenv/LICENCE;md5=213287c5c111f72c9bbf0c9d8d2df3d0 \
"

GOSRC_INCLUDEGUARD += "github.com-joho-godotenv-sources.inc"

