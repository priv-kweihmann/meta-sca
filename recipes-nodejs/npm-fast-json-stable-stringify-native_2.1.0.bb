SUMMARY = "NPM: fast-json-stable-stringify"
DESCRIPTION = "deterministic `JSON.stringify()` - a faster version of substack's json-stable-strigify without jsonify"
HOMEPAGE = "https://github.com/epoberezkin/fast-json-stable-stringify"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=febe55307df96f60ad763842f5a8ca6f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fast-json-stable-stringify/-/fast-json-stable-stringify-2.1.0.tgz"
SRC_URI[md5sum] = "7c847271886a3d27ac1fb9f8c1854888"
SRC_URI[sha256sum] = "1e2df822c43e0a2b448e5df79bf8e6d3e085c86e30456cd383a2f96215fd1687"

NPM_PKGNAME = "fast-json-stable-stringify"

inherit npmhelper
inherit native
