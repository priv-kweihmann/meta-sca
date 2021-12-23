SUMMARY = "NPM: style-search"
DESCRIPTION = "Search CSS(-like) strings"
HOMEPAGE = "https://github.com/davidtheclark/style-search#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1a742d72a08adab0d76a29972b52ebf1"

SRC_URI = "https://registry.npmjs.org/style-search/-/style-search-0.1.0.tgz"
SRC_URI[md5sum] = "989dffabdc760d24d5b2922bb8964176"
SRC_URI[sha256sum] = "a7a32dc94b6ad65ebc77b7452bec25d0b4605d0f8ed090142e73e1e34dedd283"

NPM_PKGNAME = "style-search"

inherit npmhelper
inherit native
