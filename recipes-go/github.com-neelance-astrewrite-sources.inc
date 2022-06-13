SRC_URI += "https://proxy.golang.org/github.com/neelance/astrewrite/@v/v0.0.0-20160511093645-99348263ae86.zip;srcoutput=github.com/neelance/astrewrite;srcinput=github.com/neelance/astrewrite@v0.0.0-20160511093645-99348263ae86;downloadfilename=github-com-neelance-astrewrite-0.0.0-20160511093645-99348263ae86.zip;name=github-com-neelance-astrewrite"
SRC_URI[github-com-neelance-astrewrite.sha256sum] = "815811c2140669e55e99d59d4bdd2fcf4c810610a9d278fd25cc2c3480c002d4"

GOSRC_LICENSE += "\
    BSD-2-Clause \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/neelance/astrewrite/LICENSE;md5=f4b65c3768b4f4fa12eefdc35581be25 \
"

GOSRC_INCLUDEGUARD += "github.com-neelance-astrewrite-sources.inc"

