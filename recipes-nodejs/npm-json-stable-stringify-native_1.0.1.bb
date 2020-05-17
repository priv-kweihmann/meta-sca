SUMMARY = "NPM: json-stable-stringify"
DESCRIPTION = "deterministic JSON.stringify() with custom sorting to get deterministic hashes from stringified results"
HOMEPAGE = "https://github.com/substack/json-stable-stringify"

DEPENDS = "npm-jsonify-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1"

SRC_URI = "https://registry.npmjs.org/json-stable-stringify/-/json-stable-stringify-1.0.1.tgz"
SRC_URI[md5sum] = "7712931a8d538cad6e4beaccd491cbb2"
SRC_URI[sha256sum] = "70e228b750bf40ab69dda437f284992f1ea4c4bf9e788dc7fc586a6956256150"

NPM_PKGNAME = "json-stable-stringify"

inherit npmhelper
inherit native
