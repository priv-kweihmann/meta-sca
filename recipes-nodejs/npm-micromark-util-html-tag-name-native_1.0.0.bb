SUMMARY = "NPM: micromark-util-html-tag-name"
DESCRIPTION = "micromark utility with list of html tag names"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=86;endline=87;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/micromark-util-html-tag-name/-/micromark-util-html-tag-name-1.0.0.tgz"
SRC_URI[md5sum] = "2d600c10975ba1c792dd02790824107a"
SRC_URI[sha256sum] = "65eba346f7a5645e61992464629efb035b3739a88fd66a96f25f891b79d7c952"

NPM_PKGNAME = "micromark-util-html-tag-name"

inherit npmhelper
inherit native
