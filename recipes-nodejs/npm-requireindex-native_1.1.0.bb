SUMMARY = "NPM: requireindex"
DESCRIPTION = "Write minimal node index.js files that require and export siblings by file basename"


LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://registry.npmjs.org/requireindex/-/requireindex-1.1.0.tgz"
SRC_URI[md5sum] = "7fc5c9978b14465a2900fb1aeee82c63"
SRC_URI[sha256sum] = "b0e758ea106218167748cc0628b9665c99f06207f096a54495ec8354045d063d"

NPM_PKGNAME = "requireindex"

inherit npmhelper
inherit native
