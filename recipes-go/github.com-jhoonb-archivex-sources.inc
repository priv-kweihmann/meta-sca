SRC_URI += "https://proxy.golang.org/github.com/jhoonb/archivex/@v/v0.0.0-20201016144719-6a343cdae81d.zip;srcoutput=github.com/jhoonb/archivex;srcinput=github.com/jhoonb/archivex@v0.0.0-20201016144719-6a343cdae81d;downloadfilename=github-com-jhoonb-archivex-0.0.0-20201016144719-6a343cdae81d.zip;name=github-com-jhoonb-archivex"
SRC_URI[github-com-jhoonb-archivex.sha256sum] = "f1ea19d43813a6e1db36d9ea50ae5f4a91d925bd10ec2fd4078555c0d1fea9f1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
"
LIC_FILES_CHKSUM += "\
    file://github.com/jhoonb/archivex/LICENSE;md5=eed6747e7211322f3930da9dbb9ffc16 \
"

GOSRC_INCLUDEGUARD += "github.com-jhoonb-archivex-sources.inc"

