SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001064.tgz"
SRC_URI[md5sum] = "9bcd0196b2bc5e9543f4bf0294105c08"
SRC_URI[sha256sum] = "db352afeb57465c6a2c998e8b79110f479a8c6fe38120adc9e27ceb1c92e5223"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
