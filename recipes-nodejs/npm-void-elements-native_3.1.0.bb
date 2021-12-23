SUMMARY = "NPM: void-elements"
DESCRIPTION = "Array of "void elements" defined by the HTML specification."
HOMEPAGE = "https://github.com/jadejs/void-elements"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59fd674729486594752aefa0ff5a385d"

SRC_URI = "https://registry.npmjs.org/void-elements/-/void-elements-3.1.0.tgz"
SRC_URI[md5sum] = "e1d1bc01b07499dd199e066e2a495626"
SRC_URI[sha256sum] = "3d193901d3827711923c52847501072ff82abf4b5ee89dbbc9b4bda3b66a6937"

NPM_PKGNAME = "void-elements"

inherit npmhelper
inherit native
