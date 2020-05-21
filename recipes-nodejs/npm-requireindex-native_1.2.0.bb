SUMMARY = "NPM: requireindex"
DESCRIPTION = "Write minimal node index.js files that require and export siblings by file basename"
HOMEPAGE = "https://github.com/stephenhandley/requireindex"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/requireindex/-/requireindex-1.2.0.tgz"
SRC_URI[md5sum] = "d3c021af45a4029568517c6a2af40049"
SRC_URI[sha256sum] = "a728192bc0a9d132e122265b02e2ed327139599785889b04c9770c9458721ec3"

NPM_PKGNAME = "requireindex"

inherit npmhelper
inherit native
