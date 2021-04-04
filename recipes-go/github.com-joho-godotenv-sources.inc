SRC_URI += "https://proxy.golang.org/github.com/joho/godotenv/@v/v1.3.0.zip;srcoutput=github.com/joho/godotenv;srcinput=github.com/joho/godotenv@v1.3.0;downloadfilename=github-com-joho-godotenv-1.3.0.zip;name=github-com-joho-godotenv"
SRC_URI[github-com-joho-godotenv.sha256sum] = "acef5a394fbd1193f52d0d19690b0bfe82728d18dd3bf67730dc5031c22d563f"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/joho/godotenv/LICENCE;md5=213287c5c111f72c9bbf0c9d8d2df3d0 \
"

GOSRC_INCLUDEGUARD += "github.com-joho-godotenv-sources.inc"

