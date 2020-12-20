SUMMARY = "NPM: vscode-uri"
DESCRIPTION = "The URI implementation that is used by VS Code and its extensions"
HOMEPAGE = "https://github.com/microsoft/vscode-uri#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3f8a83a05bc59c7a6122980df91bdd1c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/vscode-uri/-/vscode-uri-3.0.1.tgz"
SRC_URI[md5sum] = "17cd3cbd7b7f3aa27dada7433c3236f6"
SRC_URI[sha256sum] = "c6100689cdb563a6eab858486ade0acbb3072e658e3fa931b4d4e3304c14f551"

NPM_PKGNAME = "vscode-uri"

inherit npmhelper
inherit native
