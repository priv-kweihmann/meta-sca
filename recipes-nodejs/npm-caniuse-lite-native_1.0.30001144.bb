SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001144.tgz"
SRC_URI[md5sum] = "00d1529802b0cc6d0da1f389fe5aaa9b"
SRC_URI[sha256sum] = "ed92996687f3006286b52dd2a961fefd36cb40785badeae124fbf21cd27f43b8"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
