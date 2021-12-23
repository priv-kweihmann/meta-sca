SUMMARY = "NPM: js-tokens"
DESCRIPTION = "Tiny JavaScript tokenizer."
HOMEPAGE = "https://github.com/lydell/js-tokens#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a0e011810241b9e837de91a9f6bea8d1"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/js-tokens/-/js-tokens-7.0.0.tgz"
SRC_URI[md5sum] = "da0da829348033827c3903dffa7e03c7"
SRC_URI[sha256sum] = "33ef21cbfbb3c746aae9c84138c8f3032ff226a89f9b3b50b882b60d02863c0b"

NPM_PKGNAME = "js-tokens"

inherit npmhelper
inherit native
