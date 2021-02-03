SUMMARY = "RubyGem: aws-sdk-costandusagereportservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Cost and Usage Report Service"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "5bbd22300090903cf661b7cdb361d873"
SRC_URI[sha256sum] = "f37ab812a8c993ddfdbffdff4fb1466d534d19cfb77295f9338648e43a82ebb7"

GEM_NAME = "aws-sdk-costandusagereportservice"

inherit rubygems
