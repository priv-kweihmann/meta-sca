SUMMARY = "RubyGem: azure_graph_rbac"
DESCRIPTION = "Microsoft Azure Active Directory Graph Rbac Client Library for Ruby"
HOMEPAGE = "https://aka.ms/azure-sdk-for-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=092360f323f49d1b492399cde2d257b1"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-ms-rest-azure"

SRC_URI[md5sum] = "605fa24c18078a99b24aff15fadf8241"
SRC_URI[sha256sum] = "4fb5cb6af3233a70a4051f824b394f0a296ea2b33d29ad861c41f582ae44bd56"

GEM_NAME = "azure_graph_rbac"

inherit rubygems
