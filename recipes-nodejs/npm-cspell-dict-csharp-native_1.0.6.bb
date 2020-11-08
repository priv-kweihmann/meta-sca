SUMMARY = "NPM: cspell-dict-csharp"
DESCRIPTION = "C# dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/csharp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-csharp/-/cspell-dict-csharp-1.0.6.tgz"
SRC_URI[md5sum] = "a4d39db2b49194960e6b41a9253b4e6f"
SRC_URI[sha256sum] = "a5556edc868325730fd9860c160de269811a91343c1a7c6315351e74b5aef9e6"

NPM_PKGNAME = "cspell-dict-csharp"

inherit npmhelper
inherit native
