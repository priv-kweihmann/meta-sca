SUMMARY = "RubyGem: aws-sdk-sqs"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Queue Service (Amazon SQS)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9a1a6c7e661950ec239a4dbc09ced015"
SRC_URI[sha256sum] = "08c0965276a814a9bf6db7d82a5abb4e523193382c774b4bb270d1d265307977"

GEM_NAME = "aws-sdk-sqs"

inherit rubygems
