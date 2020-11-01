SUMMARY = "NPM: cspell-dict-csharp"
DESCRIPTION = "C# dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/csharp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-csharp/-/cspell-dict-csharp-1.0.5.tgz"
SRC_URI[md5sum] = "f6baa019fc9ed49a97ae540fcf0d0208"
SRC_URI[sha256sum] = "9de8c33a8edd31ec13818a366db7d1bb2ed7157fd8d1049b1d8bb2dd3e9f71fb"

NPM_PKGNAME = "cspell-dict-csharp"

inherit npmhelper
inherit native
