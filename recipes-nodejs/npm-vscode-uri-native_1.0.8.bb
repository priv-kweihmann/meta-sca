SUMMARY = "NPM: vscode-uri"
DESCRIPTION = "The URI implementation that is used by VS Code and its extensions"
HOMEPAGE = "https://github.com/Microsoft/vscode-uri#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3f8a83a05bc59c7a6122980df91bdd1c"

SRC_URI = "https://registry.npmjs.org/vscode-uri/-/vscode-uri-1.0.8.tgz"
SRC_URI[md5sum] = "ada2e5a07a97e435279fa127219257ac"
SRC_URI[sha256sum] = "51ddb52af3dbf6d0996206025ba8b935cd8bf09bee3ec2cdf375338ec270ec32"

S = "${WORKDIR}/package"

NPM_PKGNAME = "vscode-uri"

inherit npmhelper
inherit native
