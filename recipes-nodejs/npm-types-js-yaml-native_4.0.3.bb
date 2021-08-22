SUMMARY = "NPM: @types/js-yaml"
DESCRIPTION = "TypeScript definitions for js-yaml"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/js-yaml"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/js-yaml/-/js-yaml-4.0.3.tgz"
SRC_URI[md5sum] = "07a2969a40cb12a59198aa7f9cd77ef3"
SRC_URI[sha256sum] = "a125f0039191749ac45bbef9500145fdd4b71ac4e00dc5dfcb2a1954fdc768ff"

NPM_PKGNAME = "@types/js-yaml"

inherit npmhelper
inherit native

S = "${WORKDIR}/js-yaml"
