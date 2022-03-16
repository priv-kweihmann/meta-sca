SUMMARY = "NPM: vscode-languageserver-textdocument"
DESCRIPTION = "A simple text document implementation for Node LSP servers"
HOMEPAGE = "https://github.com/Microsoft/vscode-languageserver-node#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.txt;md5=37d16f91c111fe38ce06b92c27cd23fb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/vscode-languageserver-textdocument/-/vscode-languageserver-textdocument-1.0.4.tgz"
SRC_URI[md5sum] = "847bc543df869a51f4b7c3027a143f29"
SRC_URI[sha256sum] = "96401396910323326ae0781ed0fa64b1c09fb724f17cb8a0c7663ce67f3c3522"

NPM_PKGNAME = "vscode-languageserver-textdocument"

inherit npmhelper
inherit native
