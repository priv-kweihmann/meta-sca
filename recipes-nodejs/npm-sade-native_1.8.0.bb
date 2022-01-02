SUMMARY = "NPM: sade"
DESCRIPTION = "Smooth (CLI) operator 🎶"
HOMEPAGE = "https://github.com/lukeed/sade#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a1892d5a0eed5aae41e3df6a732d5ca3"

DEPENDS = "npm-mri-native"

SRC_URI = "https://registry.npmjs.org/sade/-/sade-1.8.0.tgz"
SRC_URI[md5sum] = "b4e6a1afafb922e9e1e328cfb60742e1"
SRC_URI[sha256sum] = "3afc50c6a8c21de5d5328b9130f4a80698b7ad6a44cec083669fbe769948728e"

NPM_PKGNAME = "sade"

inherit npmhelper
inherit native
