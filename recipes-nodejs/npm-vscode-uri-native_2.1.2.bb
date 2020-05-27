SUMMARY = "NPM: vscode-uri"
DESCRIPTION = "The URI implementation that is used by VS Code and its extensions"
HOMEPAGE = "https://github.com/Microsoft/vscode-uri#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3f8a83a05bc59c7a6122980df91bdd1c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/vscode-uri/-/vscode-uri-2.1.2.tgz"
SRC_URI[md5sum] = "db642f65cdaa41d629f75f41bba3eccf"
SRC_URI[sha256sum] = "35387265515bcd64fbd5b070081a5d97421b56eb0217a5565a8e0c3ae24abc76"

NPM_PKGNAME = "vscode-uri"

inherit npmhelper
inherit native
