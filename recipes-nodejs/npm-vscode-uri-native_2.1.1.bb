SUMMARY = "NPM: vscode-uri"
DESCRIPTION = "The URI implementation that is used by VS Code and its extensions"
HOMEPAGE = "https://github.com/Microsoft/vscode-uri#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3f8a83a05bc59c7a6122980df91bdd1c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/vscode-uri/-/vscode-uri-2.1.1.tgz"
SRC_URI[md5sum] = "ae035ef68601cb0229250aabdbb5da48"
SRC_URI[sha256sum] = "7b0a94fb84ce4d905c105203612a47191f6a90a55de9016eb247227309c20b4e"

NPM_PKGNAME = "vscode-uri"

inherit npmhelper
inherit native
