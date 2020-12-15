SUMMARY = "RubyGem: aws-sdk-configservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Config (Config Service)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9e6a587f553379266fa37396180ad635"
SRC_URI[sha256sum] = "107bc9463b264b5ed0fa4e087eb74c7c37d25586dd2789f0ea52750591e1821e"

GEM_NAME = "aws-sdk-configservice"

inherit rubygems
