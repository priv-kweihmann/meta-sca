SRC_URI_append = " https://proxy.golang.org/mvdan.cc/editorconfig/@v/v0.2.0.zip;srcoutput=mvdan.cc/editorconfig;srcinput=mvdan.cc/editorconfig@v0.2.0;downloadfilename=mvdan-cc-editorconfig-0.2.0.zip;name=mvdan-cc-editorconfig"
SRC_URI[mvdan-cc-editorconfig.sha256sum] = "a9e43ad4742f27f7b2fb27820d36a5171c540fa43f9ec5d92b9b66d0a03b72d1"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/mvdan.cc/editorconfig/LICENSE;md5=5d1b329cf2d09f301b0d604f96046e5a \
"
