SUMMARY = "NPM: json-stable-stringify-without-jsonify"
DESCRIPTION = "deterministic JSON.stringify() with custom sorting to get deterministic hashes from stringified results, with no public domain dependencies"
HOMEPAGE = "https://github.com/samn/json-stable-stringify"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1"

SRC_URI = "https://registry.npmjs.org/json-stable-stringify-without-jsonify/-/json-stable-stringify-without-jsonify-1.0.1.tgz"
SRC_URI[md5sum] = "08e9086d2d987b656ea651e5e38d9ebc"
SRC_URI[sha256sum] = "5dbd60ac858b8eb9fb8219cd0dbe89cb866405749cbac90c2f8bc18acc77aeea"

NPM_PKGNAME = "json-stable-stringify-without-jsonify"

inherit npmhelper
inherit native
