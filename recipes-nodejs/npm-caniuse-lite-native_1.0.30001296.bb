SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001296.tgz"
SRC_URI[md5sum] = "ed1a43260aaf5caf73a68d1b85ca3a4f"
SRC_URI[sha256sum] = "fd6a7bf9ab04341e7bbd29729fd0c1cc4b8d70a9aa7341eb3cfeb9c3c7c26286"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
