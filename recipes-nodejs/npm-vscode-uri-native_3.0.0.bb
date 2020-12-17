SUMMARY = "NPM: vscode-uri"
DESCRIPTION = "The URI implementation that is used by VS Code and its extensions"
HOMEPAGE = "https://github.com/microsoft/vscode-uri#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3f8a83a05bc59c7a6122980df91bdd1c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/vscode-uri/-/vscode-uri-3.0.0.tgz"
SRC_URI[md5sum] = "a353471790ae20740b3943743d6a71f8"
SRC_URI[sha256sum] = "b825ac061b09522fa064d88573914b2f45e622433538336c6628faa6571796fe"

NPM_PKGNAME = "vscode-uri"

inherit npmhelper
inherit native
