SUMMARY = "NPM: vscode-uri"
DESCRIPTION = "The URI implementation that is used by VS Code and its extensions"
HOMEPAGE = "https://github.com/microsoft/vscode-uri#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3f8a83a05bc59c7a6122980df91bdd1c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/vscode-uri/-/vscode-uri-3.0.2.tgz"
SRC_URI[md5sum] = "63899ca9757b353656c1ca30f567e506"
SRC_URI[sha256sum] = "e1e26ccda45c167ec7c01d74f4e0fef5a97b96c791f0a006d9a1eaf1b9d55223"

NPM_PKGNAME = "vscode-uri"

inherit npmhelper
inherit native
