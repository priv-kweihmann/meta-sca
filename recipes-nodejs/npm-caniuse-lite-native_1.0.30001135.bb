SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001135.tgz"
SRC_URI[md5sum] = "2b200c7a7fd7d28763e658df6d9f70a4"
SRC_URI[sha256sum] = "33c2c403c4e6b4480d6c0a8611db01f9d18840f8de2d8cc4ff7113923d250fe8"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
