SUMMARY = "Duckietown package for ROS2. Provides helper functions used in the Duckietown project."

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=1e7b3bcc2e271699c77c769685058cbe"

inherit ros2
inherit ros_ament_cmake

DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
    rosidl-typesupport-c \
    std-msgs \
    geometry-msgs \
    sensor-msgs \
    visualization-msgs \
"

RDEPENDS_${PN} = " \
    std-msgs \
    geometry-msgs \
    sensor-msgs\
"

SRCREV = "6e3e342f2363bea10460a4acf4a004a3b3490901"
SRC_URI = " \
    git://github.com/lgsvl/duckietown2.git;subpath=00-infrastructure/duckietown_msgs \
"

S="${WORKDIR}/duckietown_msgs"


