SUMMARY = "RubyGem: aws-sdk-costandusagereportservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Cost and Usage Report Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "1a11da20f165ba446fd72474889554b6"
SRC_URI[sha256sum] = "be14dd84a5422c372f7bbe33837c9cf013f084aad66e6c190dcd9cae55a38ae2"

GEM_NAME = "aws-sdk-costandusagereportservice"

inherit rubygems
