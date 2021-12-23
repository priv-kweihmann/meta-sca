SUMMARY = "NPM: typedarray-to-buffer"
DESCRIPTION = "Convert a typed array to a Buffer without a copy"
HOMEPAGE = "http://feross.org"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/typedarray-to-buffer/-/typedarray-to-buffer-4.0.0.tgz"
SRC_URI[md5sum] = "3401cafebcc539493cde18b327c4dad2"
SRC_URI[sha256sum] = "deffeedf0bbfa0197a40e5632f5a96cc1a3c79e3621580ebbac9235f3865bc23"

NPM_PKGNAME = "typedarray-to-buffer"

inherit npmhelper
inherit native
