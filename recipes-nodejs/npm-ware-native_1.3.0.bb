SUMMARY = "NPM: ware"
DESCRIPTION = "Easily create your own middleware layer."
HOMEPAGE = "https://github.com/segmentio/ware"

DEPENDS = "npm-wrap-fn-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Readme.md;beginline=98;md5=691d58fd62992ce576fc4f70ab60c8f7"

SRC_URI = "https://registry.npmjs.org/ware/-/ware-1.3.0.tgz"
SRC_URI[md5sum] = "04b545050a0467acbcefa8a91907c1d9"
SRC_URI[sha256sum] = "af66b900202cb9ac6dc77070ab7cc00c94a6534780317eee806864761b9bb7cb"

NPM_PKGNAME = "ware"

inherit npmhelper
inherit native
