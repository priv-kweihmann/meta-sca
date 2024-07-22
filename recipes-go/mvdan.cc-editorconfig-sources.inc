SRC_URI += "https://proxy.golang.org/mvdan.cc/editorconfig/@v/v0.3.0.zip;srcoutput=mvdan.cc/editorconfig;srcinput=mvdan.cc/editorconfig@v0.3.0;downloadfilename=mvdan-cc-editorconfig-0.3.0.zip;name=mvdan-cc-editorconfig"
SRC_URI[mvdan-cc-editorconfig.sha256sum] = "aa50c43e789b025f04bea950f104314946d2faa5035442bf5f7415eb97860fe1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://mvdan.cc/editorconfig/LICENSE;md5=5d1b329cf2d09f301b0d604f96046e5a \
"

GOSRC_INCLUDEGUARD += "mvdan.cc-editorconfig-sources.inc"

