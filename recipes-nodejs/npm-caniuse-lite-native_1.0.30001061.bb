SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001061.tgz"
SRC_URI[md5sum] = "81012287a252d09c9f919a944f2e5275"
SRC_URI[sha256sum] = "c7664dcebe25dd51113f197e234d66e05f30e759d673d7275bb4308a08c28113"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
