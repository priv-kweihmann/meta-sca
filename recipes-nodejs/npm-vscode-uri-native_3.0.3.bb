SUMMARY = "NPM: vscode-uri"
DESCRIPTION = "The URI implementation that is used by VS Code and its extensions"
HOMEPAGE = "https://github.com/microsoft/vscode-uri#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3f8a83a05bc59c7a6122980df91bdd1c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/vscode-uri/-/vscode-uri-3.0.3.tgz"
SRC_URI[md5sum] = "2f5d0d4190d405cd772efbb20f2370e4"
SRC_URI[sha256sum] = "2663d5840c4e90e671f8050766bedd36e4fef7e0d20f0f226fe41a56dec40376"

NPM_PKGNAME = "vscode-uri"

inherit npmhelper
inherit native
