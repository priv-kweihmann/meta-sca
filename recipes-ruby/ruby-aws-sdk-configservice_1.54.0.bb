SUMMARY = "RubyGem: aws-sdk-configservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Config (Config Service)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3d29767dca3eea32b59a6fe36f4f810e"
SRC_URI[sha256sum] = "44a104a013c7470a3228365c4196c067b050de61168ff9fa0d8a98483e5349a4"

GEM_NAME = "aws-sdk-configservice"

inherit rubygems
