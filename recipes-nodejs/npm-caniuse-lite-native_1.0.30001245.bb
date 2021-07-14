SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001245.tgz"
SRC_URI[md5sum] = "b5abbaf04491a26de8b7fe7433283f50"
SRC_URI[sha256sum] = "c523bf6ff976b10f08c63a93a04d36c2e17d754946c816ffd918486e2f6a1a97"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
