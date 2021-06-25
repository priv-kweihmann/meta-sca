SUMMARY = "NPM: micromark-util-types"
DESCRIPTION = "micromark utility with a couple of typescript types"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=63;endline=64;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/micromark-util-types/-/micromark-util-types-1.0.0.tgz"
SRC_URI[md5sum] = "fc5d41ed8d710b1d12c91d5b431e864a"
SRC_URI[sha256sum] = "76f8640330401c2f86c1f29f1d6b5345a9e2592e6b5b25a52f9f139c0426fb62"

NPM_PKGNAME = "micromark-util-types"

inherit npmhelper
inherit native
