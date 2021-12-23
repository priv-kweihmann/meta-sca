SUMMARY = "NPM: txt-ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/txt-ast-traverse/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

SRC_URI = "https://registry.npmjs.org/txt-ast-traverse/-/txt-ast-traverse-1.2.1.tgz"
SRC_URI[md5sum] = "756568b38a9983b25635aef6558896b3"
SRC_URI[sha256sum] = "037a7db8132000f434b0746162e34665948f27ddd0ad8e1d13ae6f6ab7650467"

NPM_PKGNAME = "txt-ast-traverse"

inherit npmhelper
inherit native
