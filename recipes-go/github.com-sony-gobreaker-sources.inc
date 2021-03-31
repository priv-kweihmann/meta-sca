SRC_URI_append = " https://proxy.golang.org/github.com/sony/gobreaker/@v/v0.4.1.zip;srcoutput=github.com/sony/gobreaker;srcinput=github.com/sony/gobreaker@v0.4.1;downloadfilename=github-com-sony-gobreaker-0.4.1.zip;name=github-com-sony-gobreaker"
SRC_URI[github-com-sony-gobreaker.sha256sum] = "eab9bf8f98b16b051d7d13c4f5c70d6d1039347e380e0a12cb9ff6e33200d784"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/sony/gobreaker/LICENSE;md5=bc9754edcba199de9bf88b85ff7d5d2c \
"
