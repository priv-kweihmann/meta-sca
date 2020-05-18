SUMMARY = "NPM: json-buffer"
DESCRIPTION = "JSON parse & stringify that supports binary via bops & base64"
HOMEPAGE = "https://github.com/dominictarr/json-buffer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f26ea3f2a31273ebd199d933804f5e8b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json-buffer/-/json-buffer-3.0.1.tgz"
SRC_URI[md5sum] = "aea6a8995c8424f50e0e1a9b83f6e80b"
SRC_URI[sha256sum] = "d1f7464db9713c5f73c919da72de334fce0bcbd76fb08727d36712ef5dfef5a5"

NPM_PKGNAME = "json-buffer"

inherit npmhelper
inherit native
