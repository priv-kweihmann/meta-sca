SUMMARY = "NPM: @types/js-yaml"
DESCRIPTION = "TypeScript definitions for js-yaml"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/js-yaml"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/js-yaml/-/js-yaml-4.0.2.tgz"
SRC_URI[md5sum] = "c234f12a0dd2cc4cdd9671c42b8df475"
SRC_URI[sha256sum] = "bed552a0eadfcccc0d63c72a44bed32c6641ab416cfe7bc1f46b9edaa56bc25f"

NPM_PKGNAME = "@types/js-yaml"

inherit npmhelper
inherit native

S = "${WORKDIR}/js-yaml"
