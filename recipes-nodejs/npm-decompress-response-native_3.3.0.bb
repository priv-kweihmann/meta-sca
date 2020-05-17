SUMMARY = "NPM: decompress-response"
DESCRIPTION = "Decompress a HTTP response if needed"
HOMEPAGE = "https://github.com/sindresorhus/decompress-response#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=5b422d6bf88afe88977d04f8bdd4959c"

DEPENDS = "npm-mimic-response-native"

SRC_URI = "https://registry.npmjs.org/decompress-response/-/decompress-response-3.3.0.tgz"
SRC_URI[md5sum] = "55bee69efa5b9d0f856c6f58090332d4"
SRC_URI[sha256sum] = "d9a56b26543e99e9d84048ba99071b11264af16d4efe58d86ad26887955341ff"

NPM_PKGNAME = "decompress-response"

inherit npmhelper
inherit native
