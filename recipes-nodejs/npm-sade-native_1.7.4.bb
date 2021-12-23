SUMMARY = "NPM: sade"
DESCRIPTION = "Smooth (CLI) operator 🎶"
HOMEPAGE = "https://github.com/lukeed/sade#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a1892d5a0eed5aae41e3df6a732d5ca3"

DEPENDS = "npm-mri-native"

SRC_URI = "https://registry.npmjs.org/sade/-/sade-1.7.4.tgz"
SRC_URI[md5sum] = "546c9169cfd0b32ead5f9e1346e45dcc"
SRC_URI[sha256sum] = "e0f611d482d9f838aafa2030514f279d829be10374f0f26389ce542979e5b437"

NPM_PKGNAME = "sade"

inherit npmhelper
inherit native
