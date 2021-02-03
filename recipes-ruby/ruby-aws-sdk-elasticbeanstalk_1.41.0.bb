SUMMARY = "RubyGem: aws-sdk-elasticbeanstalk"
DESCRIPTION = "Official AWS Ruby gem for AWS Elastic Beanstalk (Elastic Beanstalk)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8efe6d559c42513e1f885f58cfbe4e98"
SRC_URI[sha256sum] = "5ff0a23d157e3bb617d498569de22331d718f7f6ff28cb1985b8e070b34e33a9"

GEM_NAME = "aws-sdk-elasticbeanstalk"

inherit rubygems
