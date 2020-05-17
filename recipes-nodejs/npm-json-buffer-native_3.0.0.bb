SUMMARY = "NPM: json-buffer"
DESCRIPTION = "JSON parse & stringify that supports binary via bops & base64"
HOMEPAGE = "https://github.com/dominictarr/json-buffer"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f26ea3f2a31273ebd199d933804f5e8b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/json-buffer/-/json-buffer-3.0.0.tgz"
SRC_URI[md5sum] = "eea6096ef5e7ad10e7ce740f2096af11"
SRC_URI[sha256sum] = "e78f797f58704e8bdb876d10a1098efc0c15883b69d273261ca0ac9c542a2b91"

NPM_PKGNAME = "json-buffer"

inherit npmhelper
inherit native
